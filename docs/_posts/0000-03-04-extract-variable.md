## Extract Variable

Extract part of a line (an expression) into a variable (and other duplicate code)

+ Split long line of code into meaningful chunks
+ Can be used to remove duplication
+ Can make the variable name descriptive
+ Different to extracting constants

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
final boolean numberOfAIsMultipleOf3 = numberOfA % 3 == 0;
if (numberOfAIsMultipleOf3) {
    total -= 20;
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
const numberOfAIsMultipleOf3 = numberOfA % 3 === 0;
if (numberOfAIsMultipleOf3) {
    total -= 20;
}
```

--

## Exercise: Extract all the variables!

Aim: practice extract variable refactor

* ***Commit your work before we continue***
* Do not break ThingyTest
* **ONLY** use extract variable against expressions
    * Java/IntelliJ Mac: <kbd><kbd>⌥</kbd>+<kbd>⌘</kbd>+<kbd>V</kbd></kbd>, Windows: <kbd><kbd>Ctrl</kbd>+<kbd>Alt</kbd>+<kbd>V</kbd></kbd>
    * JS/VS Code: <kbd><kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>R</kbd></kbd>, Extract to constant in enclosing scope
    * C#/Visual Studio: <kbd><kbd>Ctrl</kbd>+<kbd>.</kbd></kbd>, Introduce local constant for '…'
* Try to make it make more sense

Note: Called Extract constant in Visual Studio / VS Code

--

## Review

+ Did you improve the code?
+ What variables did you extract?  
  (live-code the suggestions…)
+ Commit your work before we continue!

Note:
Toggle between extended and mirrored with <kbd><kbd>⌘</kbd> <kbd>F1</kbd></kbd>  
Apply refactors as suggested  
