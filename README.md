# CartServiceAPI (Using FakeCartApi)
## Structure of my Project
  ### - My Project contains four modules that are based on MVC Structure.
  ####   ~ Modules are : _controller_ , _dto_ , _models_ , _services_
  ####    * Inside _controller_ 
  -> A CartController class which keeps all the mapping of endpoints and validates the methods with the endpoints
  ####   * Inside _dto_ 
  -> A CartDTO class which keeps the structure of data which is received by when we fetch through API and then use this DTO class as per our needs.
  ####   * Inside _models_ 
  -> It has two classes : Cart & Product -> Cart holds the properties of a cart and product holds the properties of product
  #### * Inside _services_ 
  -> It has a class named : **CartService** , which keeps the logic of all the methods which are mapped in the controller class.
  ->Other one is an Interface : **CartInterface**

## Methods and their run test :

### Note : I am running the test in IntelliJ Environment 

### * getCartById() :
Source Code :

<img width="332" alt="image" src="https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/270001ca-960a-4034-9ef1-41a4b9e2f337">

Test : 

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/0324ca0d-0bb1-4025-bb6c-90d238780151)

### * getAllcart() :
Source Code :

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/3778f0ef-b139-40ea-ae6e-af8e04ba497f)



Test : 

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/a1658273-823d-4c9e-a427-0794f0659776)

### * getCartInRangeOfDate():
Source code :

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/15b9db1b-2e88-4d5e-a643-d9d6aed0c0a4)

Test:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/a06f0d6f-1ba2-4b64-9b06-ed46b8e6be46)



### * getCartByUserId():

Source Code:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/60c8eb30-552c-4b23-821b-b356c6835437)

Test:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/6ef47e00-89d7-4a5e-beb0-d66045e2f422)

### * addNewCart():

Source Code:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/5c26503b-ab40-4bf7-b2b7-40d2f5f7b8ae)


Test:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/018aaca5-00af-469c-81cd-f436b7b6f992)


### * updateCart() :

Source Code :

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/5e5d9113-5b8e-4128-a60d-1d43f0347024)

Test:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/c27708f3-c227-47ba-b86e-fbc4afe013ff)

### * deleteCart():

Source Code:

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/cca62634-5549-4cda-b963-5a90763ea2ab)

Test :

![image](https://github.com/harsh-kumar-patwa/CartServiceAPI/assets/135590545/7ca6d5cd-5b5c-4f3b-aa01-f2b1fcb27256)








        

