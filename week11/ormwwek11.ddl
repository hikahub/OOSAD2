DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Sales;
CREATE TABLE Employee (ID int(10) NOT NULL AUTO_INCREMENT, Name varchar(255), Address varchar(255), Mobile varchar(255), PPS varchar(255), Year varchar(255), Department varchar(255), Salary varchar(255), PRIMARY KEY (ID));
CREATE TABLE Sales (ID int(11) NOT NULL AUTO_INCREMENT, Product varchar(255), `Date` varchar(255), Quantity varchar(255), PRIMARY KEY (ID));
