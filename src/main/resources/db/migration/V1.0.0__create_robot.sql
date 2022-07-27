CREATE TABLE IF NOT EXISTS `robot`
(
    `id`           BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `code`         VARCHAR(255)    NOT NULL,
    `date_created` DATETIME        NOT NULL NOT NULL,
    `date_updated` DATETIME        NOT NULL NOT NULL,
    PRIMARY KEY (`id`)
    );

INSERT INTO `robot` (`id`, `code`, `date_created`, `date_updated`)
    VALUE (1, 'linweiyu', NOW(), NOW());