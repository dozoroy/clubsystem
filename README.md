# -
基本功能的社团管理系统

## 主界面登录
 * 登录:localhost:8080/#/login
 * 进入:localhost:8080/#/index


## 不可用接口：
 * http://localhost:8443/api/users/delete    delete      **存在相关信息时无法删除用户**
 * http://localhost:8443/api/clubs/delete    delete      **存在相关信息时无法删除社团**


## 用户属性:
 * http://localhost:8443/api/users           alluser
 * http://localhost:8443/api/users           addorupdate   **参数user**
 * http://localhost:8443/api/users/{userid}  
 * http://localhost:8443/api/username/        **参数username**

  


## 社团属性
*  http://localhost:8443/api/clubs          allclub
*  http://localhost:8443/api/clubs          addorupdate     **参数club**
*  http://localhost:8443/api/clubs/{clubid}
*  http://localhost:8443/api/clubname/       **参数clubname**
*  http://localhost:8443/api/users/{userid}/clubs/{clubid}/delete  **参数userid,clubid**
  

## 新闻属性
*  http://localhost:8443/api/news          allnews       
*  http://localhost:8443/api/news          addorupdate    **参数news**
*  http://localhost:8443/api/news/delete   delete         **参数news**
*  http://localhost:8443/api/news/{newsid}
*  http://localhost:8443/api/api/clubs/{clubid}/news      **参数clubid**
*  http://localhost:8443/api/newsname/    **参数newsname**
*  

## 活动属性
*  http://localhost:8443/api/events        allevents
*  http://localhost:8443/api/events        addorupdate   **参数event**
*  http://localhost:8443/api/events/delete  delete        **参数event**
*  http://localhost:8443/api/events/{eventid}
*  http://localhost:8443/api/clubs/{clubid}/events       **参数clubid**
*  http://localhost:8443/api/eventname/    **参数eventname**
*  http://localhost:8443/api/users/{userid}/events/{eventid}/delete

## 财务属性
*  http://localhost:8443/api/finaces         allfinaces
*  http://localhost:8443/api/finaces         addorupdate   **参数finace**
*  http://localhost:8443/api/finaces/delete  delete        **参数finace**
*  http://localhost:8443/api/finaces/{finaid}
*  http://localhost:8443/api/clubs/{clubid}/finaces        **参数clubid**
*  http://localhost:8443/api/finaname/     **参数finaname**
  
## 评论属性
*  http://localhost:8443/api/comts          allcomts
*  http://localhost:8443/api/comts          addorupdate
*  http://localhost:8443/api/comts/delete   delete
*  http://localhost:8443/api/comts/{comid}
*  http://localhost:8443/api/users/{userid}/comts          **参数userid**
*  http://localhost:8443/api/news/{newsid}/comts           **参数newsid**
*  http://localhost:8443/api/users/{userid}/news/{newsid}/delete
*  http://localhost:8443/api/content/     **参数content**

## 用户社团属性
*  http://localhost:8443/api/userclubs    all
*  http://localhost:8443/api/userclubs    addorupdate
*  http://localhost:8443/api/userclubs/delete  delete
*  http://localhost:8443/api/{clubid}/rolestate    **社团职务**
*  http://localhost:8443/api/{userid}/myrolestate  **用户的社团职务与社团审批**

## 用户活动属性
*  http://localhost:8443/api/userevents   all
*  http://localhost:8443/api/userevents   addorupdate
*  http://localhost:8443/api/userevents/delete  delete
*  http://localhost:8443/api/{eventid}/state      **社团活动** 
*  http://localhost:8443/api/{userid}/mystate     **用户的社团活动与活动审批**

## 发送加入社团欢迎邮件
*  http://localhost:8443/api/{clubid}/send/{userid}











