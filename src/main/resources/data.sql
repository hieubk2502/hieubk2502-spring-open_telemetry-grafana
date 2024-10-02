CREATE TABLE orders (
        id int8 NOT NULL,
        customer_id int8 NULL,
        order_date timestamptz(6) NULL,
        total_amount numeric(38, 2) NULL,
        CONSTRAINT orders_pkey PRIMARY KEY (id)
);

INSERT INTO orders.orders(id, customer_id, order_date, total_amount) VALUES(1, 1, '2023-11-25T23:33:12.130+02:00', 10);
INSERT INTO orders.orders(id, customer_id, order_date, total_amount) VALUES(2, 2, '2023-11-25T23:33:12.130+02:00', 30);