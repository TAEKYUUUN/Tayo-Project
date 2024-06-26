document.addEventListener('DOMContentLoaded', ()=>{
			const selectAllCheckbox = document.querySelectorAll('#checkAllUser');
			const addrow = document.querySelector('#addrow')
			const deleterow = document.querySelector('#deleterow');
			
			const allowcancel = document.querySelector('#allowcancel');
			const allowsave = document.querySelector('#allowsave');
			const exitallow = document.querySelector('#exitallow');
			
			const addNewMember = document.querySelector('#addNewMember');
			
			addNewMember.addEventListener('click',(event)=>{
				const rowAmount = document.querySelectorAll('tbody td');
				let validtest = document.querySelectorAll('.invalidValue');
				
				
				if(rowAmount.length >0 && validtest.length ===0){
					document.querySelector('#div_backgroundfull').style.removeProperty('display');
					document.querySelector('#div_allowpopup').style.removeProperty('display');
				}else{
					alert('입력값을 다시 확인해주세요');	
				}
			})
			
			allowcancel.addEventListener('click',(event)=>{
				document.querySelector('#div_backgroundfull').style.display="none";
				document.querySelector('#div_allowpopup').style.display="none";
			});
			exitallow.addEventListener('click',(event)=>{
				document.querySelector('#div_backgroundfull').style.display="none";
				document.querySelector('#div_allowpopup').style.display="none";
			});
			allowsave.addEventListener('click',(event)=>{
				document.querySelector('#div_backgroundfull').style.display="none";
				document.querySelector('#div_allowpopup').style.display="none";
				const table = document.querySelector('tbody');
				table.innerHTML='<tr></tr>';
				
			});
			
			
			
			selectAllCheckbox.forEach(input =>{
				input.addEventListener('change', (event)=>{
					const selectedtable = input.closest('table');
					const everyinput = selectedtable.querySelectorAll('tbody input[type="checkbox"]');
					const ischecked = event.target.checked;
					
					everyinput.forEach(checkbox =>{
							checkbox.checked = ischecked;
					})
				})
				
			})
			
			addrow.addEventListener('click', (event) =>{
				const inserttable = document.querySelector('table');
				let newRow = inserttable.insertRow();
				let cells = [];
				let cell1 = newRow.insertCell();
				cell1.innerHTML = '<input type="checkbox">';
				let namecell = newRow.insertCell();
				namecell.innerHTML = '<input type="text" class="invalidValue" id="newName">';
				cells.push(namecell);
				let emailcell = newRow.insertCell();
				emailcell.innerHTML = '<input type="text" class="invalidValue" id="newEmail">';
				cells.push(emailcell);
				for(let i = 4; i<=7; i++){
					let cell = newRow.insertCell();
					cell.innerHTML = '<input type="text">';
					cells.push(cell);
				}
				
				const newName = document.querySelector('#newName');
				const newEmail = document.querySelector('#newEmail');
				newName.addEventListener('change', (event) =>{
					let inputvalue = event.target.value;
					if(inputvalue !== ""){
						event.target.classList.remove('invalidValue');
					}else{
						event.target.classList.add('invalidValue');
					}
				});
				newEmail.addEventListener('change', (event) =>{
					let inputvalue = event.target.value;
					let email_regex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
					if(email_regex.test(inputvalue)){
						event.target.classList.remove('invalidValue');
					}else{
						event.target.classList.add('invalidValue');
					}
				});
				
			})
			deleterow.addEventListener('click', (event) =>{
				const table = document.querySelector('table');
				const everyinput = table.querySelectorAll('tbody input[type="checkbox"]');
				let checkedelements = [];
				everyinput.forEach((input,index) =>{
					if(input.checked){
						checkedelements.push(input.closest('tr'));			
					}
				})
				checkedelements.forEach(row =>{
					row.parentNode.removeChild(row);
				})
			})
		})