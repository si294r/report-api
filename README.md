# Report API
API Report Alami Sharia

Create an API Based on requirement:

   1. Spring Boot Framework.
   2. MySQL Database or another RDBMS.
   3. Hibernate or another ORM.
   4. REST API: Content Type(JSON)
   5. include class diagram
   6. Include a Readme
   7. Tested with Swagger UI

Have 4 Tables :

A. User
   - user_id
   - user_name
   - name
   - jabatan_id
   - created_date
   - updated_date
   - created_by
   - updated_by
   
B. Jabatan
   - jabatan_id
   - jabatan_name
   - created_date
   - updated_date
   - created_by
   - updated_by
   
C. Project
   - project_id
   - project_name
   - created_date
   - updated_date
   - created_by
   - updated_by
   
D. Report
   - report_id
   - berita_acara
   - tipe
   - amount
   - project_id
   - user_id
   - created_date
   - updated_date
   - created_by
   - updated_by
   - approved_by
   - approval_status
   - report_date
   - approved_date
   
   For Testing and check API, you can try it on swagger ui on : localhost:8086/swagger-ui.html
