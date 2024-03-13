
# Test Plan: Test Cases for BalancedBrackets

## Test 1: Only the brackets return the true
### Description: 
Verify that the 'hasBalancedBrackets' function returns 'true' when the string contains only square brackets.

### Entrance:
- "[LaunchCode]"
- "Launch[Code]"
- "[]LaunchCode"
- "[]" 

### Expected Output:
- The function is expected to return 'true' for all inputs provided.

## Test 2: Imbricated supports are allowed
### Description:
Verify that the 'hasBalancedBrackets' function correctly handles nested brackets. 

### Entrance:
- "[Launch[Code]]"
- "Laun[ch[Cod]e]"
### Expected Output:
- The function is expected to return 'true' for all inputs provided.

## Test Case 3: Brackets Must Follow the Correct Order of Opening and Closing

### Description:
Verify that the 'hasBalancedBrackets' function returns 'false' when the brackets do not follow the correct order of opening and closing.

### Entrance:
- "[LaunchCode"
- "Launch]Code["
- "["
- "]["

### Expected Output:
- The function is expected to return 'false' for all provided inputs.




