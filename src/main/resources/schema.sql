drop table if exists currency_exchange CASCADE;

create table currency_exchange
(
    id                  bigint not null,
    conversion_multiple numeric(19, 2),
    given_currency      varchar(255),
    target_currency     varchar(255),
    primary key (id)
);