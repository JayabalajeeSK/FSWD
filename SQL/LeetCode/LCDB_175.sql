select Person.firstName, Person.lastName, Address.city, Address.state from person
Left join address
on Person.personId = Address.personId