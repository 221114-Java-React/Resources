# Introduction to DBMS

**Database Management System (DBMS)** is a software for storing and retrieving users’ data while considering appropriate
security measures. It consists of a group of programs which manipulate the database. The DBMS accepts the request for
data from an application and instructs the operating system to provide the specific data. In large systems, a DBMS helps
users and other third-party software to store and retrieve data.

DBMS allows users to create their own databases as per their requirement. The term “DBMS” includes the user of the
database and other application programs. It provides an interface between the data and the software application.

# Multiplicity

There are four types of multiplicities: one-to-one, one-to-many, many-to-one, and many-to-many.

## One-to-one

Each entity instance is related to a single instance of another entity. For example, to model a physical warehouse in
which each storage bin contains a single widget, StorageBin and Widget would have a one-to-one relationship. One-to-one
relationships use the javax.persistence.OneToOne annotation on the corresponding persistent property or field.

## One-to-many

An entity instance can be related to multiple instances of the other entities. A sales order, for example, can have
multiple line items. In the order application, Order would have a one-to-many relationship with LineItem. One-to-many
relationships use the javax.persistence.OneToMany annotation on the corresponding persistent property or field.

## Many-to-one

Multiple instances of an entity can be related to a single instance of the other entity. This multiplicity is the
opposite of a one-to-many relationship. In the example just mentioned, from the perspective of LineItem the relationship
to Order is many-to-one. Many-to-one relationships use the javax.persistence.ManyToOne annotation on the corresponding
persistent property or field.

## Many-to-many

The entity instances can be related to multiple instances of each other. For example, in college each course has many
students, and every student may take several courses. Therefore, in an enrollment application, Course and Student would
have a many-to-many relationship. Many-to-many relationships use the javax.persistence.ManyToMany annotation on the
corresponding persistent property or field.

# Referential Integrity

Referential integrity refers to the relationship between tables. Because each table in a database must have a primary
key, this primary key can appear in other tables because of its relationship to data within those tables. When a primary
key from one table appears in another table, it is called a foreign key.

Foreign keys join tables and establish dependencies between tables. tables can form a hierarchy of dependencies in such
a way that if you change or delete a row in one table, you destroy the meaning of rows in other tables. For example, the
following figure shows that the customer_num column of the customer table is a primary key for that table and a foreign
key in the orders and cust_call tables. Customer number 106, George Watson™, is referenced in both the orders and
cust_calls tables. If customer 106 is deleted from the customer table, the link between the three tables and this
particular customer is destroyed.

<img src="https://www.ibm.com/docs/en/SSGU8G_14.1.0/com.ibm.sqlt.doc/sqlt009.gif"> 

# Types of keys

Databases are used to store massive amounts of information which is stored across multiple tables. Each table might be
running into thousands of rows. Needless to say, there will be many duplicate rows with redundant information. How do we
deal with that? How do we manage records so that we are storing only unique data? And, how do we relate the multiple
tables that are present in the database?

SQL keys are the answer to all these queries.

- An SQL key is either a single column (or attribute) or a group of columns that can uniquely identify rows (or tuples)
  in a table.

SQL keys ensure that there are no rows with duplicate information. Not only that, but they also help in establishing a
relationship between multiple tables in the database. Therefore, it becomes imperative to learn about the different keys
in SQL.

- Primary Key
- Candidate Key
- Alternate Key
- Super Key
- Composite Key
- Foreign Key
- Unique Key

<img src="https://media.geeksforgeeks.org/wp-content/uploads/image7.png">

## Primary Key

A primary key (PK) is the column or columns that contain values that uniquely identify each row in a table. A database
table must have a primary key to insert, update, restore, or delete data from a database table.

## Foreign Key

A foreign key (FK) are structured into a database as a common component linking together two tables. A
foreign key must always reference a primary key elsewhere.