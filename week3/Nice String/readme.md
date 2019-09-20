# Nice String

```
A string is nice if at least two of the following conditions are satisfied:
'Nice String'의 nice 기준은 아래 3개의 기준 중에 2개 이상을 만족 시키면 된다.
```

1. It doesn't contain substrings bu, ba or be;(bu, ba, be를 포함하지 않는다)
2. It contains at least three vowels (vowels are a, e, i, o and u); (최소 3개 이상의 모음을 포함해야 한다.)
3. It contains a double letter (at least two similar letters following one another), like b in "abba".
Your task is to check whether a given string is nice. Strings for this task will consist of lowercase letters only. Note that for the purpose of this task, you don't need to consider 'y' as a vowel.(최소 2개 이상의 같은 알파벳이 붙어있어야 한다)

Note that any two conditions might be satisfied to make a string nice. For instance, "aei" satisfies only the conditions #1 and #2, and ```"nn"` satisfies the conditions #1 and #3, which means both strings are nice.

## Example 1

`"bac"` isn't nice. No conditions are satisfied: it contains a ba substring, contains only one vowel and no doubles.

## Example 2

`"aza"` isn't nice. Only the first condition is satisfied, but the string doesn't contain enough vowels or doubles.

## Example 3

`"abaca"` isn't nice. The second condition is satisfied: it contains three vowels a, but the other two aren't satisfied: it contains ba and no doubles.

## Example 4

`"baaa"` is nice. The conditions #2 and #3 are satisfied: it contains three vowels a and a double a.

## Example 5

`"aaab"` is nice, because all three conditions are satisfied.

Run TestNiceString to check your solution.
