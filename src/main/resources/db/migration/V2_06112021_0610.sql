INSERT INTO `t_authority` (`id`, `authority`)
VALUES (1, 'ADMIN'),
       (2, 'USER');

INSERT INTO `t_product` (`id`, `expire_date`, `name`, `price`)
VALUES (1, '2022-11-30', 'Buku', '2500.00'),
       (2, '2022-11-01', 'pulpen', '2000.00');


INSERT INTO `t_user` (`id`, `name`, `password`, `username`)
VALUES (1, 'naruto', '$2a$04$wV2IXXdzJKRmndM/zpq9/.qv1mTemTv5gptLz59m2NKbvTgmuz/ZS', 'naruto'),
       (2, 'sasuke', '$2a$04$wV2IXXdzJKRmndM/zpq9/.qv1mTemTv5gptLz59m2NKbvTgmuz/ZS', 'sasuke');


-- -------------------------------------------------------- password naruto

INSERT INTO `t_user_authorities` (`user_id`, `authority_id`)
VALUES (1, 1),
       (2, 2);
