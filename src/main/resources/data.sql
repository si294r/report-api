DELETE FROM alami.jabatan;
DELETE FROM alami.project;
DELETE FROM alami.`user`;
DELETE FROM alami.report;

INSERT INTO alami.jabatan (jabatan_id,jabatan_name,created_date,created_by,updated_date,updated_by) VALUES
('J001','Manajer Keuangan','2020-02-09','ADMIN',NULL,NULL)
,('J002','Manajer Proyek','2020-02-09','ADMIN',NULL,NULL)
,('J003','Aktivis Lapangan','2020-02-09','ADMIN',NULL,NULL)
;

INSERT INTO alami.project (project_id,project_name,created_by,created_date,updated_by,updated_date) VALUES
('P001','Penanaman 1000 pohon Kaliandra Merah di desa Banjarsari, kecamatan Gombong, kabupaten Kebumen','jojo2','2020-02-09',NULL,NULL)
,('P002','Pembinaan 40 anak yatim piatu di desa Jatiasih, kabupaten Bekasi','jojo2','2020-02-09',NULL,NULL)
,('P003','Pembuatan rumah untuk keluarga miskin di Kelurahan Majalengka Wetan, Kab. Majalengka','jojo2','2020-02-09',NULL,NULL)
;

INSERT INTO alami.`user` (user_id,user_name,name,jabatan_id,created_date,updated_date,created_by,updated_by) VALUES
('A456','jojo1','Jonathan','J001','2020-02-09',NULL,'ADMIN',NULL)
,('A234','jojo2','Joseph','J002','2020-09-02','2020-02-09','ADMIN','ADMIN')
,('A999','jojo3','Jotaro','J003','2020-02-09',NULL,'ADMIN',NULL)
;

INSERT INTO alami.report (report_id,berita_acara,tipe,amount,project_id,user_id,created_by,created_date,updated_by,updated_date,approved_by,approval_status,report_date,approved_date) VALUES
('R234','pembelian batu bata','pengeluaran',1000000,'P003','A999','J003','2020-01-29',NULL,NULL,'jojo2','approved','2020-01-02','2020-02-09')
,('R235','pembelian batu bata','pengeluaran',2000000,'P003','A999','J003','2020-01-29',NULL,NULL,'jojo2','approved','2020-01-02','2020-02-09')
,('R236','pembelian batu bata','pengeluaran',3000000,'P003','A999','J003','2020-01-29',NULL,NULL,'jojo2','approved','2020-01-02','2020-02-09')
;
