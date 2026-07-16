CREATE TABLE `post` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `member_id` int DEFAULT NULL,
                        `title` varchar(200) NOT NULL,
                        `content` text NOT NULL,
                        `view_count` int NOT NULL DEFAULT '0',
                        `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
                        PRIMARY KEY (`id`),
                        KEY `fk_post_member` (`member_id`),
                        CONSTRAINT `fk_post_member` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci