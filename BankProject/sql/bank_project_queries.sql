create schema jancy1;

use jancy1;

create table customer (
    customer_id int,
    customer_name varchar(255),
    address varchar(255),
    city varchar(255),
    
    created_date date,
    created_by varchar(255),
    updated_date date,
    updated_by varchar(255),
	PRIMARY KEY(customer_id)
);

alter table customer ADD phone_no int AFTER city;

select * from customer;

select * from customer where customer_id = 101;

delete from customer where customer_id = 0;

insert into customer values (101, 'Jerin', '1315 Riverchase Dr Apt 2117', 'Coppell', NOW(), 'SYSTEM', null, null);

select max(CUSTOMER_ID)+1 as CUSTOMER_ID from customer;

rollback;
commit;
----------------------------------------------------

create table account (
    account_id int,
    customer_id int,
    account_balance DECIMAL(19,2),
    
    created_date datetime,
    created_by varchar(255),
    updated_date datetime,
    updated_by varchar(255),
	PRIMARY KEY(account_id),
    FOREIGN KEY (customer_id)  REFERENCES customer(customer_id)  
);

-- drop table account;

insert into account values(1003, 103, 140, NOW(), 'SYSTEM', null, null);
commit;

select * from account;

----------------------------------------------------

create table transaction (
    transaction_id int,
    account_id int,
	transaction_type varchar(255),
    transaction_amount DECIMAL(19,2),
    transaction_time datetime,
    
    created_date datetime,
    created_by varchar(255),
    updated_date datetime,
    updated_by varchar(255),
	PRIMARY KEY(transaction_id),
    FOREIGN KEY (account_id)  REFERENCES account(account_id)  
);

insert into transaction values(10001, 1001, 'Withdraw', 25.00, NOW(), NOW(), 'SYSTEM', null, null);
select * from transaction;
commit;

