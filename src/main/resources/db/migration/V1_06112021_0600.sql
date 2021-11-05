CREATE TABLE hibernate_sequence
(
    next_val bigint
) engine=InnoDB;

INSERT INTO hibernate_sequence
VALUES (1);

CREATE TABLE t_authority
(
    id        integer NOT NULL,
    authority varchar(255),
    PRIMARY KEY (id)
) engine=InnoDB;

CREATE TABLE t_product
(
    id          integer NOT NULL,
    expire_date date,
    name        varchar(255),
    price       decimal(19, 2),
    PRIMARY KEY (id)
) engine=InnoDB;

CREATE TABLE t_user
(
    id       integer NOT NULL,
    name     varchar(255),
    password varchar(255),
    username varchar(255),
    PRIMARY KEY (id)
) engine=InnoDB;

CREATE TABLE t_user_authorities
(
    user_id      integer NOT NULL,
    authority_id integer NOT NULL
) engine=InnoDB;

ALTER TABLE t_user_authorities
    ADD CONSTRAINT FKoi707ac3cjbh0sv6ynijqes1v
        FOREIGN KEY (authority_id)
            REFERENCES t_authority (id);

ALTER TABLE t_user_authorities
    ADD CONSTRAINT FKjt148awfaj5l6oukwbo23w93h
        FOREIGN KEY (user_id)
            REFERENCES t_user (id);
