# Normalization - 1NF, 2NF, 3NF

Normalization is the process of reorganizing data in a database so that it meets two basic requirements:

1. There is no redundancy of data, all data is stored in only one place.
2. Data dependencies are logical, all related data items are stored together.

Normalization is important for many reason, but chiefly because it allows databases to take up as little disk space as
possible, resulting in creased performance.

Normalization is also known as data normalization.

The first goal during dta normalization is to detect and remove all duplicate data by logically grouping dta
redundancies together. Whenever a piece of dta is dependent on another, the two should be stored in proximity within
that data set.

By getting rid of all anomalies and organizing unstructured data into a structured form, normalization greatly improves
the usability of a data set. Data can be visualized more easily, insights could be extracted more efficiently, and
information can be updated more quickly. As redundancies are merged together, the risk of errors and duplicates further
making data even more disorganized is reduced. On top of all that, a normalized database takes less space, getting rid
of many disk space problems, and increasing its overall performance significantly.

The three main types of normalization are listed below. Note: "NF" refers to "normal form."

## 1NF - First Normal Form

Tables in 1NF adhere to some rules:

- Each cel must contain only a single (atomic) value
- Every column in the table must be uniquely named
- All values in a column must pertain to the same domain

## 2NF - Second Normal Form

Tables in 2NF must be in 1NF and not have any partial dependency (e.g. every non-prime attribute must be dependent on
the table's primary key)

## 3NF - Third Normal Form

Tables in 3NF mus be in 2NF and have no transitive functional dependencies on the primary key.

# Data Types

The data type of column defines what value the column can hold: integer, character, money, date and time, binary, and so
on.

Each column in a database table is required to have a name and a data type. An SQL developer must decide what type of
data that will be stored inside each column when creating a table. The data type is a guideline for SQL to understand
what type of data is expected inside of each column, and it also identifies how SQL will interact with the stored data.

## SQL Dtata types

https://www.w3schools.com/sql/sql_datatypes.asp

<br>

# Schemas

A database schema is an abstract design that represents the storage of your data in a database. It describes both the
organization of data and the relationships between tables in a given database. Developers plan a database schema in
advance, so they know what components are necessary and how they will connect to each other.

## Physical Schema

The physical database schema represents how data is stored on disk storage. In other words, it is the actual code that
will be used to create the structure of your database.

## Logical Schema

Logical database schemas are less abstract, compared to conceptual schemas. They clearly define schema objects with
information, such as table names, field names, entity relationships, and integrity constraints—i.e. any rules that
govern the database. However, they do not typically include any technical requirements.

# DDL, DQL, DML, DCL, TCL

## Data Definition Language

**DDL** or **Data Definition Language** actually consists of the SQL commands that can be used to define the database
schema. It simply deals with descriptions of the database schema and is used to create and modify the structure of
database objects in the database.

List of **DDL** commands:

- **CREATE**: This command is used to create the database or its objects (like table, index, function, views, store
  procedure, and triggers).


- **DROP**: This command is used to delete objects from the database.


- **ALTER**: This is used to alter the structure of the database.


- **TRUNCATE**: This is used to remove all records from a table, including all spaces allocated for the records are
  removed.


- **COMMENT**: This is used to add comments to the data dictionary.


- **RENAME**: This is used to rename an object existing in the database.

## Data Query Language

**DQL** statements are used for performing queries on the data within schema objects. The purpose of the DQL Command is
to get some schema relation based on the query passed to it. We can define DQL as follows it is a component of SQL
statement that allows getting data from the database and imposing order upon it.

List of **DQL**:

- **SELECT**: It is used to retrieve data from the database.

## Data Manipulation Language

The SQL commands that deals with the manipulation of data present in the database belong to DML or Data Manipulation
Language and this includes most of the SQL statements.

List of **DML** commands:

- **INSERT** : It is used to insert data into a table.


- **UPDATE**: It is used to update existing data within a table.


- **DELETE** : It is used to delete records from a database table.


- **LOCK**: Table control concurrency.


- **CALL**: Call a PL/SQL or JAVA subprogram.


- **EXPLAIN PLAN**: It describes the access path to data.

## Data Control Language

DCL includes commands such as GRANT and REVOKE which mainly deal with the rights, permissions, and other controls of the
database system.

List of DCL commands:

- **GRANT**: This command gives users access privileges to the database.


- **REVOKE**: This command withdraws the user’s access privileges given by using the GRANT command.

## Transaction Control Language

List of TCL commands:

- **COMMIT**: Commits a Transaction.


- **ROLLBACK**: Rollbacks a transaction in case of any error occurs.


- **SAVEPOINT**: Sets a savepoint within a transaction.


- **SET TRANSACTION**: Specify characteristics for the transaction.

<br>

# Basic SQl Queries

## CREATE TABLE

<pre>
CREATE TABLE table_name (
   column1 datatype(length) column_contraint,
   column2 datatype(length) column_contraint,
   column3 datatype(length) column_contraint,
   table_constraints
);
</pre>

### Example

<pre>
CREATE TABLE accounts (
	user_id serial PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	password VARCHAR ( 50 ) NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	created_on TIMESTAMP NOT NULL,
        last_login TIMESTAMP 
);
</pre>

## SELECT TABLE

<pre>
SELECT select_list FROM table_name;
</pre>

### Example

Selecting everything from `customer` table

<pre>
SELECT * FROM customer;
</pre>


Selecting a specific column from `customer` table

<pre>
SELECT first_name FROM customer;
</pre>

Selecting multiple specific columns from `customer` table

<pre>
SELECT first_name, last_name, email FROM customer;
</pre>

## INSERT INTO TABLE

<pre>
INSERT INTO table_name(column1, column2, …) VALUES (value1, value2, …);
</pre>

## DROP TABLE

<pre>
DROP TABLE IF EXISTS table_name;
</pre>

<br>

# Built-in functions - Scalar and aggregate

For doing operations on data SQL has many built-in functions, they are categorized in two categories and further
sub-categorized in different seven functions under each category. The categories are:

## Scalar

These functions are based on user input, these too returns single value.

- **UCASE()**: it converts the value of a field to uppercase.


- **LCASE()**: it converts the value of a field to lowercase.


- **MID()**: the MID() function extracts texts from the text field.


- **LEN()**: the LEN() function returns the length of the value in a text field.


- **ROUND()**: the ROUND() function is used to round a numeric field to the number of decimals specified.NOTE: Many
  database systems have adopted the IEEE 754 standard for arithmetic operations, which says that when any numeric .5 is
  rounded it results to the nearest even integer i.e, 5.5 and 6.5 both gets rounded off to 6.


- **NOW()**: the NOW() function returns the current system date and time.


- **FORMAT()**: the FORMAT() function is used to format how a field is to be displayed.

## Aggregates

These functions are used to do operations from the values of the column and a single value is returned.

- **AVG()**: it returns the average value after calculating from values in a numeric column.


- **COUNT()**: it is used to count the number of rows returned in a SELECT statement.


- **FIRST()**: the FIRST() function returns the first value of the selected column.


- **LAST()**: the LAST() function returns the last value of the selected column.


- **MAX()**: the MAX() function returns the maximum value of the selected column.


- **MIN()**: the MIN() function returns the minimum value of the selected column.


- **SUM()**: the SUM() function returns the sum of all the values of the selected column.


<br>

# Logical Operations

Logical operators (also known as boolean operators)  are used to estimate some set of conditions where the result can be
TRUE, FALSE, or NULL (missing, unknown, unavailable, unassigned).

There are 3 logical operators available in PostgreSQL:

- **AND**: if both boolean expressions are true then it will return TRUE.

- **OR**: if any boolean expression is true then it will return TRUE.

- **NOT**: reverses the value of Boolean operator. 