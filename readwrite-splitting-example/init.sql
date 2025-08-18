
DROP DATABASE IF EXISTS demo_ds_0;
DROP DATABASE IF EXISTS demo_ds_1;
DROP DATABASE IF EXISTS demo_ds_2;

CREATE DATABASE demo_ds_0;
CREATE DATABASE demo_ds_1;
CREATE DATABASE demo_ds_2;
create table t_address
(
    address_id   bigint       not null
        primary key,
    address_name varchar(255) null
);

create table t_order_item
(
    user_id       int          null,
    order_id      bigint       null,
    order_item_id bigint auto_increment
        primary key,
    phone         varchar(255) null,
    status        varchar(255) null
);

create table t_order
(
    order_type int          null,
    user_id    int          null,
    address_id bigint       null,
    order_id   bigint auto_increment
        primary key,
    status     varchar(255) null
);



