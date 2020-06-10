const rp = require("request-promise-native");
let site1 = {
  uri: "https://www.grotto-networking.com",
  method: "HEAD", // What does this do?
  resolveWithFullResponse: true
};

let site2 = {
  uri: "http://www.google.com",
  method: "HEAD",
  resolveWithFullResponse: true
};

let site3 = {
  uri: "https://kitewest.com.au/",
  method: "HEAD",
  resolveWithFullResponse: true
};

let start = new Date();
let p1 = rp(site1).then(res => {
  // console.log(`Grotto status: ${JSON.stringify(res)}`);
  let time = (new Date() - start) / 1000;
  return console.log(`Grotto status: ${res.statusCode}, time: ${time}`);
});

let p2 = rp(site2).then(res => {
  let time = (new Date() - start) / 1000;
  return console.log(`Google status: ${res.statusCode}, time: ${time}`);
});

let p3 = rp(site3).then(res => {
  let time = (new Date() - start) / 1000;
  return console.log(
    `Aus kiteboarding status: ${res.statusCode}, time: ${time}`
  );
});

console.log("Starting my web requests:");
Promise.race([p1, p2, p3]).then(x => {
  console.log("was the winner! \n The rest: ");
});