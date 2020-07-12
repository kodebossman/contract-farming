use cfms_db;

/*provinces*/
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Mash East');
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Mash West');
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Mash Central');
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Harare');
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Bulawayo');
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Mat North');
INSERT INTO `cfms_db`.`province` (`name`) VALUES ('Math South');

/*districts */
INSERT INTO `cfms_db`.`district` (`name`, `total_wards`, `province_id`) VALUES ('Mrewa', '47', '1');
INSERT INTO `cfms_db`.`district` (`name`, `total_wards`, `province_id`) VALUES ('Mtoko', '20', '1');
INSERT INTO `cfms_db`.`district` (`name`, `total_wards`, `province_id`) VALUES ('Msami', '80', '1');
INSERT INTO `cfms_db`.`district` (`name`, `total_wards`, `province_id`) VALUES ('Macheke', '40', '1');
INSERT INTO `cfms_db`.`district` (`name`, `total_wards`, `province_id`) VALUES ('Marondera', '40', '1');

/*farmers*/
INSERT INTO `cfms_db`.`farmers` (`first_name`, `id_number`, `last_name`, `latitude`, `longitude`, `msisdn`, `village`, `district_id`) VALUES ('kuda', '47471', 'kuda', 'x1', 'x2', '077756599', 'makunde', '1');
INSERT INTO `cfms_db`.`farmers` (`first_name`, `id_number`, `last_name`, `latitude`, `longitude`, `msisdn`, `village`, `district_id`) VALUES ('bossman', '565668', 'muparuri', 'x1', 'x3', '077756598', 'ganya', '1');
INSERT INTO `cfms_db`.`farmers` (`first_name`, `id_number`, `last_name`, `latitude`, `longitude`, `msisdn`, `village`, `district_id`) VALUES ('bosskd', '707080', 'katche', 'x4', 'x5', '077756597', 'upfu', '1');
INSERT INTO `cfms_db`.`farmers` (`first_name`, `id_number`, `last_name`, `latitude`, `longitude`, `msisdn`, `village`, `district_id`) VALUES ('nehoreka', '69697', 'mukonyonga', 'x6', 'x7', '0777756433', 'mkara', '2');
INSERT INTO `cfms_db`.`farmers` (`first_name`, `id_number`, `last_name`, `latitude`, `longitude`, `msisdn`, `village`, `district_id`) VALUES ('maguku', 'brjrr', 'mbechu', 'x8', 'x9', '07777565432', 'chinga', '3');
INSERT INTO `cfms_db`.`farmers` (`first_name`, `id_number`, `last_name`, `latitude`, `longitude`, `msisdn`, `village`) VALUES ('nhauro', '001', 'baq', 'x10', 'x11', '07756599', 'kuda','2');

/* contractors*/
INSERT INTO `cfms_db`.`contractor` (`contractor_bank_account`, `contract_bank_branch`, `contractor_bank_name`, `contractor_email`, `contractor_name`, `contractor_phone_number`, `contractor_physical_address`, `contractor_type`) VALUES ('001', '111', 'cbz', 'agrotech.com', 'Agrotechnology', '0777756599', 'bossman home', '1');
INSERT INTO `cfms_db`.`contractor` (`contractor_bank_account`, `contract_bank_branch`, `contractor_bank_name`, `contractor_email`, `contractor_name`, `contractor_phone_number`, `contractor_physical_address`, `contractor_type`) VALUES ('002', '101', 'cbz', 'whitewaters.com', 'WhiteWaters', '0777756598', 'bossman code', '2');
INSERT INTO `cfms_db`.`contractor` (`contractor_bank_account`, `contract_bank_branch`, `contractor_bank_name`, `contractor_email`, `contractor_name`, `contractor_phone_number`, `contractor_physical_address`, `contractor_type`) VALUES ('003', '112', 'zb bank', 'bondwaters.com', 'Curly Braces Solutions', '0777756597', 'kode bossman', '3');
INSERT INTO `cfms_db`.`contractor` (`contractor_bank_account`, `contract_bank_branch`, `contractor_bank_name`, `contractor_email`, `contractor_name`, `contractor_phone_number`, `contractor_physical_address`, `contractor_type`) VALUES ('004', '122', 'zb bank', 'saizle.com', 'Saizle', '0775659980', 'sazle', '2');
INSERT INTO `cfms_db`.`contractor` (`contractor_bank_account`, `contract_bank_branch`, `contractor_bank_name`, `contractor_email`, `contractor_name`, `contractor_phone_number`, `contractor_physical_address`, `contractor_type`) VALUES ('005', '112', 'Banc ABC', 'nit.com', 'Nhowe Institute Of Technology', '0777756581', 'nhowe p bag 904 macheke', '1');

/*contracts*/
INSERT INTO `cfms_db`.`contracts` (`contract_name`, `contract_type`, `date_signed`, `description`, `contract_end_date`, `contractor_id`, `farmer_id`) VALUES ('SOYA-1', '2', '1900-01-01 00:00:00.000000', 'second copy', '1900-01-01 00:00:00.000000', '1', '3');
INSERT INTO `cfms_db`.`contracts` (`contract_name`, `contract_type`, `date_signed`, `description`, `contract_end_date`, `contractor_id`, `farmer_id`) VALUES ('SOYA-3', '1', '1900-01-01 00:00:00.000000', 'third contract', '1900-01-01 00:00:00.000000', '1', '4');
INSERT INTO `cfms_db`.`contracts` (`contract_name`, `contract_type`, `date_signed`, `description`, `contract_end_date`, `contractor_id`, `farmer_id`) VALUES ('FODYA', '3', '1900-01-01 00:00:00.000000', 'fourht contract', '1900-01-01 00:00:00.000000', '1', '5');
INSERT INTO `cfms_db`.`contracts` (`contract_name`, `contract_type`, `date_signed`, `description`, `contract_end_date`, `contractor_id`, `farmer_id`) VALUES ('FODYA', '3', '1900-01-01 00:00:00.000000', 'tith contract', '1900-01-01 00:00:00.000000', '2', '1');

/*Join Query to find farmers  on contract*/
SELECT contracts.id,contracts.contractor_id , farmers.first_name, farmers.last_name, farmers.id_number
FROM contracts
INNER JOIN farmers ON contracts.farmer_id=farmers.id;




