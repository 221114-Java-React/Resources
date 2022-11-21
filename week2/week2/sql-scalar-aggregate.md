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