/*
1. iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
iqTest("") → 0 // there are no numbers in the given set
iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
*/
function iqTest(numbers) {
  if(number===''){
    return 0;
  }
    var numArr = numbers.split(' ');
  
    var oddPosArr = [];
    var evenPosArr = [];
    for(var i = 0; i < numArr.length; i++) {
      if(numArr[i] % 2) {
        oddPosArr.push(i + 1);
        
      } 
      else {
       evenPosArr.push(i + 1);
      }
    }
    
     if((oddPosArr.length === 1)) {
        return oddPosArr[0];
    }
    else {
      return evenPosArr[0];
    }
  }