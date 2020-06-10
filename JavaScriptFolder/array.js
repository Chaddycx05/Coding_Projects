const arr = [1,2,3,4,7,6,7,12,43,54];

const mappedArr = arr.map(function(u,i){
    return [u,i];
})

const filterArr = arr.filter(function(u,i){
    if (u%2==0)
        return u;
})

const red = filterArr.reduce(function(u,i){
    return u;
})

console.log(mappedArr);