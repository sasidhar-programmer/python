
var nums = [5,4, 8, 9, 2, 1] 


for(let j = 1; j <= nums.length; j++) { 

    var key = nums[j] 
    var i = j - 1 

    while(i > 0 && nums[i] > key) { 
        nums[i+1] = nums[i] 
        i = i-1 
    }
    nums[i+1] = key 

}

console.log(nums)


