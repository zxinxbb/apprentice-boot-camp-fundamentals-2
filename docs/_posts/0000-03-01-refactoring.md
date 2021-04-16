# Boot-camp
## Fundamentals 2
### Day Two

--

## Review

+ Yesterday:
  + TDD
  + Bowling
+ Today:
  + Refactoring
  + DRY

--

## Feedback

---

## Refactoring

+ What is it?

Note:
  Explain we are covering refactoring as it’s part of TDD, and a necessary skill for next exercises 
  Ask for suggestions  

--

> “Code refactoring is the process of restructuring existing computer code—changing the factoring—without changing its external behavior.”—Wikipedia

Note: Highlight ‘without changing its external behaviour’  
  Changing nonfunctional properties of the code

--

## Refactoring vs Rewriting

What is the difference?

--

## Rewriting **can** change functionality

Note:
  Term refactoring often used to mean rewriting  
  Just terminology but important to be intentional  
  Rewriting can break functionality  
  Refactoring does not/should not  

--

## Why Refactor?

+ Improve maintainability
+ Make code easier to read
+ Make code easier to change

Note:
  Arguably readability is about maintainability  

--


## Stay green!

<background>green</background>

+ Compilation errors and failing tests are a distraction
+ Generally refactoring doesn’t break tests / syntax
+ Less head scratching ten minutes later…

--

## What is a refactor?

Recognised technique by which you change some aspect of the code

--

## For example…

+ Rename / Rename Symbol
+ Extract variable
+ Extract field
+ Extract constant
+ Extract method/function
+ Inline method/function

--

## You may currently do these things manually

(and slowly)

(and the code is broken while you do)

--

## IDE to the rescue

Leverage your IDE (e.g. IntelliJ) to perform the refactor for you
+ Safer
+ Quicker (once you practice)
+ Easier
+ Less distracting

Note:
  Explain that the IDE automates manual refactors  
  Renaming a method manually could involve thousands of changes  
  Avoids intermediate compilation failures  
  All this distracts from the functionality you were adding  
