/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let maxlength=0
    let currString=[]
    for(let i=0;i<s.length;i++){
        currIndex=currString.indexOf(s[i])
        if(currIndex != -1){
            currString.splice(0,currIndex+1)
        }
        currString.push(s[i])
        maxlength=Math.max(maxlength,currString.length)
    }
    return maxlength
};