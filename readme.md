# Decision Branching
## if statement
	if (condition) {
		statement1;
	}
	else {
		statement2;
	}
	
## condition : Any expression that can only evaluate to true or false
## Example
	true
	false
	
## comparison operators
inequality
>			greater than
<			less than
>=			greater than/equal to
<=			less than/equal to
equality
==			equals to
!=			not equal to

## Example: m = 5, n = 6
	m > n		false
	m < n		true
	m == n		false

## Logicals
	&&		and
	||		or
	!		not
	
## Example:
	(m > n) || (m < n)	true
	(m > n) && (m < n)	false
	!(m > n)				true

## Bitwise Operators
	&		and
	|		or
	^ 		exclusive or

	decimal		binary
	0				0
	1				1
	2				10
	3				11
	4				100
	5				101
	6				110
	7				111
	8				1000
	
## else if (condition) : precedes the if, and it cannot stand by itself.

##else: precedes if statement and it cannot stand by itself.

	if (condition1) {
		statement1;
	}
	else if (condition2) {
		statement2;
	}
	else {
		statement3;
	}