select distinct author_id as id from Views 
where author_id=viewer_id order by id ASC
# distinct to remove duplicate values because author_id==viewer id more than 1 times