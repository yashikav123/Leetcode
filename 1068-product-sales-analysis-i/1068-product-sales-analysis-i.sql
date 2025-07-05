# Write your MySQL query statement below
SELECT  Product.product_name,Sales.year,Sales.price
FROM SALES INNER JOIN PRODUCT 
ON Sales.product_id=PRODUCT.product_id