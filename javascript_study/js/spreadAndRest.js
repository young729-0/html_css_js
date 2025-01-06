const obj = {
    data1: "d1",
    data2: 10,
    data3: [1, 2, 3, 4],
};
const obj2 = {
    ...obj,
    data2: 20,
};
/**
 * 비구조 할당(구조분해)
 */
// const data1 = obj.data1;
// const data2 = obj.data2;
const { data1:d1, data2:d2 } = obj;
console.log(d1, d2);

const nums = [ 1, 2, 3, 4, 5 ];
const [ n1, n2, n3 ] = nums; // 변수명이 틀려도 됨 
console.log(n1, n2, n3);

const { data2: dd2, ...obj3 } = obj; // ... rest -> 남아있는 
console.log(obj3);
const [ n4, n5, ...newNums ] = nums;
console.log(newNums);