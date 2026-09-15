-- E-Commerce Testing: SQL Validation Queries
-- Purpose: validate test data and database results after UI/API operations.

-- 1. Verify active products
SELECT product_id, product_name, price, stock_quantity
FROM products
WHERE active = 1
ORDER BY product_name;

-- 2. Verify product search results by category
SELECT product_id, product_name, price
FROM products
WHERE category = 'Electronics'
  AND active = 1;

-- 3. Verify cart items for a customer
SELECT c.customer_id, p.product_name, ci.quantity,
       (ci.quantity * p.price) AS line_total
FROM cart_items ci
JOIN carts c ON ci.cart_id = c.cart_id
JOIN products p ON ci.product_id = p.product_id
WHERE c.customer_id = 1001;

-- 4. Verify order total after checkout
SELECT o.order_id, o.customer_id, o.order_date,
       SUM(oi.quantity * p.price) AS calculated_total,
       o.order_total
FROM orders o
JOIN order_items oi ON o.order_id = oi.order_id
JOIN products p ON oi.product_id = p.product_id
WHERE o.order_id = 5001
GROUP BY o.order_id, o.customer_id, o.order_date, o.order_total;

-- 5. Find orders requiring regression verification
SELECT order_id, customer_id, order_status, order_total
FROM orders
WHERE order_status IN ('Pending', 'Failed')
ORDER BY order_id DESC;
