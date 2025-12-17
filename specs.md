# Constrained Tests Specifications

This document defines the specifications for constrained tests using input/output templates.

## Template Structure

Each constrained test should follow this input/output format:

```
## Test Case: [Test Name]

### Input
```
[Input specification]
```

### Output
```
[Expected output specification]
```

### Constraints
- [Constraint 1]
- [Constraint 2]
- [Constraint 3]

### Example
**Input:**
```
[Concrete input example]
```

**Output:**
```
[Concrete output example]
```
```

---

## Example Test Cases

## Test Case: Addition of Two Positive Numbers

### Input
```
Two positive integers: a and b
```

### Output
```
An integer representing the sum of a and b
```

### Constraints
- a and b are positive integers
- a <= 10000
- b <= 10000
- Result should not overflow

### Example
**Input:**
```
a = 5
b = 3
```

**Output:**
```
8
```

---

## Test Case: Division with Non-Zero Denominator

### Input
```
Two integers: numerator and denominator
Where denominator != 0
```

### Output
```
A double representing the division result
```

### Constraints
- denominator must not be zero
- Both numbers can be positive or negative
- Result precision: 2 decimal places

### Example
**Input:**
```
numerator = 10
denominator = 4
```

**Output:**
```
2.5
```

---

## Test Case: Array Processing

### Input
```
An array of integers of variable length n
```

### Output
```
The sum of all integers in the array
```

### Constraints
- 0 <= n <= 1000
- Each integer is between -1000 and 1000
- Result should handle negative numbers correctly

### Example
**Input:**
```
[1, 2, 3, 4, 5]
```

**Output:**
```
15
```

---

## Test Case: String Transformation

### Input
```
A non-null string s
```

### Output
```
The string with all characters reversed
```

### Constraints
- String length: 1 to 100 characters
- Can contain spaces and special characters
- Case should be preserved

### Example
**Input:**
```
"Hello World"
```

**Output:**
```
"dlroW olleH"
```

---

## Test Case: Edge Cases

### Input
```
Boundary and edge case values
```

### Output
```
Expected behavior at limits
```

### Constraints
- Test with minimum values
- Test with maximum values
- Test with zero/null/empty values
- Test with duplicate values

### Example
**Input:**
```
Empty array: []
```

**Output:**
```
0
```
