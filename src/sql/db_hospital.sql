CREATE DATABASE IF NOT EXISTS db_hospital;

USE db_hospital;

CREATE TABLE IF NOT EXISTS `pessoa` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `senha` varchar(6) NOT NULL,
  `data_nascimento` date NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `doutor` tinyint(1) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

INSERT INTO
  `pessoa` (
    `id`,
    `nome`,
    `cpf`,
    `senha`,
    `data_nascimento`,
    `sexo`,
    `doutor`,
    `status`
  )
VALUES
  (
    1,
    'Admin',
    '00000000000',
    '123456',
    '2022-11-09',
    'M',
    0,
    0
  ),
  (
    2,
    'Andrey Naligatski Dias',
    '47663435818',
    '123456',
    '2000-02-17',
    'M',
    0,
    0
  ),
  (
    3,
    'Bruno Leria',
    '12312312311',
    '123456',
    '1997-05-17',
    'M',
    1,
    0
  );

ALTER TABLE
  `pessoa`
ADD
  PRIMARY KEY (`id`) USING BTREE;

ALTER TABLE
  `pessoa`
MODIFY
  `id` int(11) NOT NULL AUTO_INCREMENT,
  AUTO_INCREMENT = 3;