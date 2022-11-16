alert("나 보여?")

function submit (){
    let btitle = document.querySelector(".title").value;
    let bcontent = document.querySelector(".content").value;

    let board = {"btitle": btitle,"bcontent": bcontent}


    alert("함수 실행 되냐??");
      $.ajax({
          url: "/submit",
          type: "get",
          data : JSON.stringify(board),
          contentType: "application/json", // 전송타입 : application/json
          success: function(re){
            alert("ajax리턴값은 오니??")
            alert(re);
            console.log(re);
          }
     })

}