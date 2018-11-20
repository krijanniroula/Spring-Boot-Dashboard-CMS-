CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active` int(11) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_role_id` (`role_id`),
  CONSTRAINT `id_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

CREATE TABLE `vendors` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(191) NOT NULL,
  `proprietor` varchar(191) NOT NULL,
  `contact` int(11) NOT NULL,
  `location` varchar(191) NOT NULL,
  `notes` text NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


INSERT INTO `role` VALUES (1,'ADMIN');

INSERT INTO `user` VALUES (1,1,'admin@gmail.com','admin','$2a$10$H3Pb8CCit6urmDmvesOXQuDm.3TObcRF6AGttb28vu08l2tTNuWTW',1);  --password:admin123

INSERT INTO `vendors` VALUES
(1, 'Infosys pvt. ltd.', 'Rajababu Khadka', 234290, 'Thapathali', '<p>This is Infosys</p>', '2018-10-29 03:35:01', '2018-10-29 03:35:01'),
(2, 'Horizontal pvt. ltd.', 'Hari Bahadur Tamang', 212123, 'Bhaktapur', '<p>This is horizontal</p>', '2018-10-29 03:46:40', '2018-10-29 03:46:40');
