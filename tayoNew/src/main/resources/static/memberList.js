const popupappear = function(){
			document.querySelector('#div_backgroundfull').style.removeProperty('display');
			document.querySelector('.insertpopup').style.removeProperty('display');
		}
		const popupdisappear = function(){
			document.querySelector('#div_backgroundfull').style.display="none";
			document.querySelector('.insertpopup').style.display="none";
		}
		const popupClean = function(){
			const popupValue = document.querySelector('.insertpopup').querySelectorAll('input');
			popupValue.forEach(input =>{
				input.value='';
			})
		}
		const editpopupappear = function(){
			document.querySelector('#div_backgroundfull').style.removeProperty('display');
			document.querySelector('.editpopup').style.removeProperty('display');
		}
		const editpopupdisappear = function(){
			document.querySelector('#div_backgroundfull').style.display="none";
			document.querySelector('.editpopup').style.display="none";
		}
		
		document.addEventListener('DOMContentLoaded', ()=>{
			const headtab = document.querySelectorAll('#div_headtab > a');
			const tables = document.querySelectorAll('#div_table > table');
			const selectAllCheckbox = document.querySelectorAll('#checkAllUser');
			const memberInsert = document.querySelector('#div_buttonsA2'); 
			const insertButton = document.querySelector('#addbutton1');
			const exitlogoedit = document.querySelectorAll('#exitlogoedit');
			const savebutton = document.querySelector('#savebutton1');
			const cancelbutton = document.querySelector('#cancelbutton1');
			const savebutton2 = document.querySelector('#savebutton2');
			const cancelbutton2 = document.querySelector('#cancelbutton2');
			const tableRow = document.querySelectorAll('tbody > tr');
			
			const editPopup = document.querySelector('.editpopup');
			
			tableRow.forEach(tr =>{
				tr.addEventListener('click', (event)=>{
					editpopupappear();
					editPopup.querySelector('#editpopupName').value = event.currentTarget.querySelector('.trName').textContent;
					editPopup.querySelector('#editpopupEmail').value = event.currentTarget.querySelector('.trId').textContent;
					editPopup.querySelector('#editpopupPw').value = event.currentTarget.querySelector('.trPw').textContent;
					editPopup.querySelector('#editpopupRank').value = event.currentTarget.querySelector('.trRankName').textContent;
					editPopup.querySelector('#editpopupOrg').value = event.currentTarget.querySelector('.trOrganizationName').textContent;
					editPopup.querySelector('#editpopupPhone').value = event.currentTarget.querySelector('.trPhone').textContent;
				})
			})

			
			
			cancelbutton2.addEventListener('click', ()=>{
				editpopupdisappear();
			})		
			
			cancelbutton.addEventListener('click', ()=>{
				popupdisappear();
				popupClean();
			})
			
			exitlogoedit.forEach(a =>{
				a.addEventListener('click', ()=>{
					popupdisappear();
					editpopupdisappear();
					popupClean();
				})
			})
			
			insertButton.addEventListener('click', ()=>{
				popupappear();
			})
			
			
			memberInsert.addEventListener('click', ()=>{
				const memberInsertlist = document.querySelector('#newbuttons');
				const listdisplay = memberInsertlist.style.display;
				if(listdisplay == "none"){
					memberInsertlist.style.removeProperty('display');
				}else{
					memberInsertlist.style.display="none";
				}
			})
			
			
			selectAllCheckbox.forEach(input =>{
				input.addEventListener('change',(event)=>{
					const selectedtable = input.closest('table');
					const everyinput = selectedtable.querySelectorAll('tbody input[type="checkbox"]');
					const ischecked = event.target.checked;
					
					everyinput.forEach(checkbox =>{
						checkbox.checked = ischecked;
					})
				})
			})
			
			headtab.forEach((a,index)=>{
				a.addEventListener('click',(event)=>{
					headtab.forEach(a=>{
						a.classList.remove('selectedheadtab');
					})
					event.target.classList.add('selectedheadtab');
					tables.forEach(table =>{
						table.style.display="none";
					})
                    tables[index].style.removeProperty('display');
				})
			})
		})