$(function() {
	window.pagObj = $('#pagination').twbsPagination({
		totalPages : 35,
		visiblePages : 5,
		onPageClick : function(event, page) {
			console.info(page + ' (from options)');
		}
	}).on('page', function(event, page) {
		console.info(page + ' (from event listening)');
	});
});