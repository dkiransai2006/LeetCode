# Write your MySQL query statement below
SELECT c.name AS Customers FROM Customers c
LEFT JOIN Orders o on
o.customerId = c.id
WHERE o.customerId IS NULL;
