## Extract Constant

+ Remove ‘magic numbers’
+ Add meaning to values found in the code
+ Reduce duplication of values  
  (when they are intended to change at the same time)

--

## Example

Before:

```java
if (numberOfA % 3 == 0) {
    total -= 20;
}
```

After:

```java
if (numberOfA % 3 == 0) {
    total -= DISCOUNT_VALUE_A;
}
```

--

## Example

Before:

```javascript
if (numberOfA % 3 === 0) {
    total -= 20;
}
```

After:

```javascript
if (numberOfA % 3 === 0) {
    total -= discountValueA;
}
```

--

## Exercise: Extract all the constants

Aim: get comfortable with extract constant refactor

* ***Commit your work before we continue!***
* Do not break ThingyTest
* **ONLY** use extract constant
  * Java/IntelliJ Mac: <kbd><kbd>⌥</kbd>+<kbd>⌘</kbd>+<kbd>C</kbd></kbd>, Windows: <kbd><kbd>Ctrl</kbd>+<kbd>Alt</kbd>+<kbd>C</kbd></kbd>
  * JS/VS Code: <kbd><kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>R</kbd></kbd>, Extract to constant in global scope
  * C#/Visual Studio: <kbd><kbd>Ctrl</kbd>+<kbd>.</kbd></kbd>, Introduce constant for '…'
* Try to make it make more sense

--

## Review

+ Did you improve the code?
+ What constants did you extract?  
  (live-code the suggestions…)

Note: Toggle between extended and mirrored with ‘⌘ F1’  
Apply refactors as suggested  
Make sure you cover the binary / hex numbers, booleans for multiples  
FIZZ, BUZZ etc
