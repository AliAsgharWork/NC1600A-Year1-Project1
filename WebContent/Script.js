/**


 * The following JavaScript function 
 * utilises a jQuery and
 *  AJAX request to connect to your 
 *  servlet through the HTML form input


 */


$(document).ready(function () {


	$("#SubmitButton").click(function () {


		var dataArray = $("#userInputForm").serializeArray(),


			dataObj = {};



		$(dataArray).each(function (i, field) {



			dataObj[field.name] = field.value;



		});

		//alert (dataObj['firstName'] + " " +  dataObj['lastName'])
		//alert (dataObj['Yourname'])


		//alert (dataObj['username'] + " " +  dataObj['password'])





		$('#userInputForm').on('submit', function (e) {
			$.post('http://localhost:8080/Assignment1_2019/myLet', 
				{
					s_Name: dataObj['Yourname'],
					s_Day: dataObj['days'],
					s_Month: dataObj['month'],
					s_Year: dataObj['year']

				},



				function (data, status) {

					$("#AjaxServletResponse").text(data);
					//$("#AjaxServletResponse").text(data);
				}).error(function () {

			});
			e.preventDefault();
		});


	});


});