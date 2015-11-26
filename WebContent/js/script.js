$(document).ready(function() {
	$("#joke").hide();
	
	$("#jokebtn").click(function(event) {
		$("#joke").empty();
		
		$.ajax({
			url : "newJoke",
			method : "GET"
		}).done(function(response) {
			var list = response.split(/((?:\S[^\.\?\!]*)[\.\?\!]*)/g);
			$.each(list, function(i, jokeLine) {
				$("#joke").append(jokeLine + " </br>");
			});
		});
		$("#joke").show();
		
	})
})