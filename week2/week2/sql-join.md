# PostgreSQL – Joins

<br>

A PostgreSQL Join statement is used to combine data or rows from one(self-join) or more tables based on a common field
between them. These common fields are generally the Primary key of the first table and Foreign key of other tables.
There are 4 basic types of joins supported by PostgreSQL, namely:

- Inner Join
- Left Join
- Right Join
- Full Outer Join

Some special PostgreSQL joins are below:

- Natural Join
- Cross Join
- Self Join

## Inner Join

The below statement joins the left table with the right table

```
SELECT 
	restaurants.id,
	restaurants.name,
	restaurants.city,
	restaurants.state,
	reviews.rating,
	reviews.msg
ROM 
	restaurants
INNER JOIN reviews ON restaurants.id = reviews.restaurant_id; 
```

<br>

Inner join returns a result set that contains row in the left table that matches the row in the right table.


**Venn diagram:**

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200511110211/5311.png">

## Left Join

The below statement joins the left table with the right table using

```
SELECT 
	restaurants.id,
	restaurants.name,
	restaurants.city,
	restaurants.state,
	reviews.rating,
	reviews.msg
ROM 
	restaurants
LEFT JOIN reviews ON restaurants.id = reviews.restaurant_id; 
```

<br>

Left join returns a complete set of rows from the left table with the matching rows if available from the right table.
If there is no match, the right side will have null values.

**Venn diagram:**

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200511111051/5511.png">

## Right Join

The RIGHT JOIN or RIGHT OUTER JOIN works exactly opposite to the LEFT JOIN. It returns a complete set of rows from the
right table with the matching rows if available from the left table. If there is no match, the left side will have null
values.

```
SELECT 
	restaurants.id,
	restaurants.name,
	restaurants.city,
	restaurants.state,
	reviews.rating,
	reviews.msg
ROM 
	restaurants
RIGHT JOIN reviews ON restaurants.id = reviews.restaurant_id; 
```

<br>

**Venn diagram:**

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200511114412/5711.png">

## Full Outer Join

The full outer join or full join returns a result set that contains all rows from both the left and right tables, with
the matching rows from both sides where available. If there is no match, the missing side contains null values.

```
SELECT 
	restaurants.id,
	restaurants.name,
	restaurants.city,
	restaurants.state,
	reviews.rating,
	reviews.msg
ROM 
	restaurants
FULL OUTER JOIN reviews ON restaurants.id = reviews.restaurant_id; 
```

<br>

**Venn diagram:**

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200511115118/592.png">