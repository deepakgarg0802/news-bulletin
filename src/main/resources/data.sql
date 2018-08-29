insert into NEWS_ITEM (news_id,headline,hyperlink,news_paper,category,source_url,date_created)
(SELECT * FROM CSVREAD('C:/news_bulletin666200b.csv' ));