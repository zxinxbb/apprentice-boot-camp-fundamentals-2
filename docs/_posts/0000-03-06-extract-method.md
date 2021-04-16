## Extract Method

+ Reduce duplication of blocks of code

--

## Example

Before:

```java
    if ("A".equals(sku)) {
        numberOfA++;
        if (numberOfA % 3 == 0) {
            total -= 20;
        }
    } else if ("B".equals(sku)) {
        numberOfB++;
        if (numberOfB % 2 == 0) {
            total -= 15;
        }
    }
```

--

## Example

After:

```java
    if ("A".equals(sku)) {
      numberOfA++;
      discount(numberOfA, 3, 20);
    } else if ("B".equals(sku)) {
      numberOfB++;
      discount(numberOfB, 2, 15);
    }
```

```java
  private void discount(int quantity, int offerQuantity, int discount) {
    if (quantity % offerQuantity == 0) {
      total -= discount;
    }
  }

```

--

## Example

Before:

```javascript
    if (sku === "A") {
        numberOfA++;
        if (numberOfA % 3 === 0) {
            total -= 20;
        }
    } else if (sku === "B") {
        numberOfB++;
        if (numberOfB % 2 === 0) {
            total -= 15;
        }
    }
```

--

## Example

After:

```javascript
    if (sku === "A") {
      numberOfA++;
      discount(numberOfA, 3, 20);
    } else if (sku === "B") {
      numberOfB++;
      discount(numberOfB, 2, 15);
    }
```

```javascript
  function discount(quantity, offerQuantity, discount) {
    if (quantity % offerQuantity === 0) {
      total -= discount;
    }
  }

```

--

## Exercise: Extract some code

Aim: practice extract method/function refactor

* ***Commit your work before we continue!***
* Do not break ThingyTest
* **ONLY** extract methods/functions…
  * Java/IntelliJ Mac: <kbd><kbd>⌥</kbd>+<kbd>⌘</kbd>+<kbd>M</kbd></kbd>, Windows: <kbd><kbd>Ctrl</kbd>+<kbd>Alt</kbd>+<kbd>M</kbd></kbd>
  * JS/VS Code: <kbd><kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>R</kbd></kbd>, Extract to function in global scope
  * C#/Visual Studio: <kbd><kbd>Ctrl</kbd>+<kbd>.</kbd></kbd>, Extract Method
* Try to make it make more sense

--

## Review

+ Did you improve the code?
+ What did you extract?  
  (live-code the suggestions…)

Note: Toggle between extended and mirrored with ‘⌘ F1’  
Apply refactors as suggested  

