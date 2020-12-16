$(document).ready(function() {
	$(".like_click_OtherJs").click(function() {
		var index = $(".like_click_OtherJs").index(this);
		var likeNumObj = $(".likeNum").eq(index);
		var likeNumBackground = $(".likeNumBackground").eq(index);
		var numLike = 0;
		if (likeNumBackground.css("color") == "rgb(0, 0, 255)") {
			numLike = parseInt(likeNumObj.text()) - 1;
			likeNumBackground.css('color', 'black');
			likeNumObj.text(numLike);
		} else {
			numLike = parseInt(likeNumObj.text()) + 1;
			likeNumBackground.css('color', 'blue');
			likeNumObj.text(numLike);
		}
	});
	$(".disLike_click_OtherJs").click(function() {
		var index = $(".disLike_click_OtherJs").index(this);
		var disLikeNumObj = $(".disLikeNum").eq(index);
		var disLikeNumBackground = $(".disLikeNumBackground").eq(index);
		var numDisLike = 0;
		if (disLikeNumBackground.css("color") == "rgb(0, 0, 255)") {
			numDisLike = parseInt(disLikeNumObj.text()) - 1;
			disLikeNumBackground.css('color', 'black');
			disLikeNumObj.text(numDisLike);
		} else {
			numDisLike = parseInt(disLikeNumObj.text()) + 1;
			disLikeNumBackground.css('color', 'blue');
			disLikeNumObj.text(numDisLike);
		}
	});

	$("#follow_click").click(function() {
		var followBackGround = $("#follow_background");
		if (followBackGround.css("color") == "rgb(0, 0, 255)") {
			followBackGround.css('color', 'black');
		} else {
			followBackGround.css('color', 'blue');
		}
	});

	$("#bookMark_click").click(function() {
		var bookMark_background = $("#bookMark_background");
		if (bookMark_background.css("color") == "rgb(0, 0, 255)") {
			bookMark_background.css('color', 'black');
		} else {
			bookMark_background.css('color', 'blue');
		}
	});
});