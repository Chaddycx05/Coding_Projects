from urllib.request import urlopen
from bs4 import BeautifulSoup


import textwrap
import texttable as tt

website = 'https://saltandstraw.com/flavors/'
page = urlopen(website)

soup = BeautifulSoup(page,'html.parser')
results = soup.find('section', attrs={'class':'content-area clear sf'}).findAll('div', attrs={'class':'entry-title'})


flavors = []

for title in results:
	flavors.append(title.text)

count = len(flavors)

flavors_and_links = []
links = soup.find('section', attrs={'class':'content-area clear sf'}).findAll('a', href=True)

#for link in links:
	#print(link['href'])

for i in range(count):
	flavors_and_links.append({'Flavor':flavors[i], 'Link': links[i]['href']})

descs = [] # this will hold descriptions

for i in range(count):
	link = flavors_and_links[i]['Link']
	page = urlopen(link)
	soup = BeautifulSoup(page, 'html.parser')
	result = soup.find('span', attrs={'style':'font-weight: 400;'})
	description = textwrap.wrap(result.text, width=40) #wrap the characters size 40
	desc_val = ""
	for j in description:
		desc_val += j + '\n'
	descs.append(desc_val)

tab = tt.Texttable()
headings = ['Flavor', 'Description']
tab.header(headings)

for row in zip(flavors,descs):
	tab.add_row(row)
s = tab.draw()

print(s)
