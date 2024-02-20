# Doordash+: A Spring and Hibernate-based online food ordering system
- Implemented REST API via Spring MVC, including registration, menu searching, ordering checkout, etc.
- Utilized Hibernate to access and operate the data storage(menu, restaurants, etc.)
- Provided authentication and authorization via Spring security to protect the application from malicious attacks.
- Used the Spring framework core technologies to loosely decouple all the components in the application.
- Build the client side with ReactJS and Ant Design to allow users to add items to the shopping cart and place orders.

## Data Base
- Authorities
- Customer > Cart (1 : 1) 
- Cart > OrderItem (1 : N)
- OrderItem > MenuItem (N : 1)
- MenuItem > Restaurant (N : 1)
- INFO:
  - END_POINT: onlineorder.cx6cm8wc27sw.us-east-2.rds.amazonaws.com
  - username: TingxuanLin
  - pw: Qwe123456!
  - URL: jdbc:mysql://onlineorder.cx6cm8wc27sw.us-east-2.rds.amazonaws.com:3306/onlineOrder?createDatabaseIfNotExist=true&serverTimezone=UTC