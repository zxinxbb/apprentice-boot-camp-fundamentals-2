

## Exercise: Highly Realistic Business Scenario

Remember the business example from boot camp one?

+ Extract requirements
+ Write some code

--

We want you to extract a handful of requirements around how to generate the customer bills from this description

<font size=3 align='left'>

<p>
Auto Trader is an organisation which advertises both new and used vehicles for sale.
Vehicles are advertised by both private individuals and dealers, and can be of many
different types, including cars, motorbikes and vans.
An advert, as displayed on the website, includes a price, a description, a make, a model and a registration.
</p>

<p>
In order to bill a customer for placing an advert their name and address must be stored.
Customers have the option of buying additional products to improve the quality of their adverts.
</p>

<p>
For example there is a product which changes the appearance of the advert to make it stand-out in the
search results by giving it a different background colour.
</p>

<p>
Any given vehicle can appear on multiple adverts, as they are also hosted on third-party websites
such as those run by car dealerships as well as other businesses.
</p>

<p>
All customers (dealers and private individuals) are billed every month. The costs are different for dealers and private individuals, but bills depend on how many adverts and products the customers are using.
</p>

</font>

* Aim for around 3–5 separate things
* Think a little about what you can do first

--

## Review

How did you split up the requirements?

--

### Here’s some we made earlier

<font size=5 align='left'>

<p>
**As a** dealer  
**I want** to be able to pay for a fixed rate stock level  
**So that** I can budget for my advertising expenditure  
</p>

<p>
**As a** dealer  
**I want** to be able to promote my adverts for a month  
**So that** I can stand out from my competitors when necessary  
</p>

<p>
**As a** private car seller  
**I want** to be able to place an advert for my vehicle for a monthly fee  
**So that** I can sell my vehicle  
</p>

<p>
**As a** private car seller  
**I want** to be able to promote my advert for a month  
**So that** I can sell my vehicle more quickly  
</p>

</font>

--

Part Two: Calculate a bill for each of these customers

|Customer|Type|Adverts|Products|
|-|-|-|
|Arthur’s Cars|Dealer|20|Advert promotion|
|Super Car Market|Dealer|1000|Finance, Valuations|
|Derek|Private|3|none|
|Sarah|Private|1|100 images|

* Each product costs £10/advert/month
* Adverts cost £50/month for dealers, and £20/month for private individuals

--

Design

<img src="{{ site.github.url }}/images/billing-design.svg" style="height: 500px;background:white">

--

## Review

+ How easy was it?
+ Did you follow red, green, refactor?
+ What refactors did you make?

--

## Sample Solution

Note: Sample solution is on follow_on branch

