

## Exercise: Highly Realistic Business Scenario

Remember the business example from boot camp one?

+ Extract requirements
+ Write some code

--

<!-- .element: style="text-align: left" -->
We want you to extract a handful of requirements around generating customer bills from this description:

Auto Trader is an organisation which advertises both new and used vehicles for sale. Vehicles are advertised by both private individuals and dealers, and can be of many different types, including cars, motorbikes and vans. An advert, as displayed on the website, includes a price, a description, a make, a model and a registration.<!-- .element: style="font-size: small" -->

In order to bill a customer for placing an advert their name and address must be stored. Customers have the option of buying additional products to improve the quality of their adverts.<!-- .element: style="font-size: small" -->

For example there is a product which changes the appearance of the advert to make it stand-out in the search results by giving it a different background colour.<!-- .element: style="font-size: small" -->

Any given vehicle can appear on multiple adverts, as they are also hosted on third-party websites such as those run by car dealerships as well as other businesses.<!-- .element: style="font-size: small" -->

All customers (dealers and private individuals) are billed every month. The costs are different for dealers and private individuals, but bills depend on how many adverts and products the customers are using.<!-- .element: style="font-size: small" -->

* Aim for around 3–5 separate things
* Think a little about what you can do first

--

<!-- .element: style="text-align: left" -->

### For example…

<small>
_**As a…**_ champion bowler<br/>
_**I want…**_ to be rewarded for being able to stike all ten pins<br/>
**So that…** I have an advantage over people who need two throws
</small>

--

## Review

How did you split up the requirements?

--

<!-- .element: style="text-align: left" -->

### Here’s some we made earlier

<small>
_**As a…**_ dealer<br/>
_**I want…**_ to be able to pay for a fixed rate stock level<br/>
**So that…** I can budget for my advertising expenditure

_**As a…**_ dealer<br/>
_**I want…**_ to be able to promote my adverts for a month<br/>
_**So that…**_ I can stand out from my competitors when necessary  

_**As a…**_ private car seller<br/>
_**I want…**_ to be able to place an advert for my vehicle for a monthly fee<br/>
_**So that…**_ I can sell my vehicle  

_**As a…**_ private car seller<br/>
_**I want…**_ to be able to promote my advert for a month<br/>
_**So that…**_ I can sell my vehicle more quickly  

_**As a…**_ advertiser<br/>
_**I want…**_ to be able to advertise my vehicles on other websites<br/>
_**So that…**_ I can reach a wider audience  
</small>

--

### Scenarios

+ Testing by specification
+ Less ambiguous
+ Given, When, Then
+ Feel familiar?
+ Arrange, Act, Assert 😍 Given, When, Then

--

<!-- .element: style="text-align: left" -->

### Here’s some we made earlier

<small>
_**Given… **_ there have been no previous throws<br/>
_**When… **_ a strike is thrown<br/>
_**Then… **_ the score is not yet known

_**Given… **_ there has been one previous frame which was a strike<br/>
_**and…**_ the current frame has had one throw which knocked down one pin<br/>
_**When… **_ the next throw knocks down a single pin<br/>
_**Then… **_ the score is 14

</small>

--

Part Two: write some scenarios covering bills for each of these customers

|Customer|Type|Adverts|Products|
|-|-|-|
|Arthur’s Cars|Dealer|20|Advert promotion|
|Super Car Market|Dealer|1000|Finance, Valuations|
|Derek|Private|3|none|
|Sarah|Private|1|100 images|

* Each product costs £10/advert/month
* Adverts cost £50/month for dealers, and £20/month for private individuals

--

<!-- .element: style="text-align: left" -->

Write some code to calculate a bill as specified by your scenarios

<small>
<fragment/>_**Given… **_ a dealer has 20 adverts with the advert promotion product<br/>
_**When… **_ the month’s bill is generated<br/>
_**Then… **_ the total will be £1,200

<fragment/>_**Given… **_ a dealer has 1000 adverts with finance and valuation products<br/>
_**When… **_ the month’s bill is generated<br/>
_**Then… **_ the total will be £70,000

<fragment/>_**Given… **_ a private seller has three adverts with no products<br/>
_**When… **_ the month’s bill is generated<br/>
_**Then… **_ the total will be £60

<fragment/>_**Given… **_ a private seller has one advert with the 100 images product<br/>
_**When… **_ the month’s bill is generated<br/>
_**Then… **_ the total will be £30

</small>

--

Design

<img src="{{ site.github.url }}/images/billing-design.svg" style="height: 500px;background:white">

--

Design

<img src="{{ site.github.url }}/images/billing-javascript-design.png" style="height: 500px;background:white">

--

## Review

+ How easy was it?
+ Did you follow red, green, refactor?
+ Were your scenarios testable?
+ What refactors did you make?

--

## Sample Solution

Note: Sample solution is on follow_on branch

