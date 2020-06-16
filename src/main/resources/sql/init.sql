CREATE DATABASE /*!32312 IF NOT EXISTS*/`sharding` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sharding`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(99) NOT NULL,
  `pwd` varchar(99) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;