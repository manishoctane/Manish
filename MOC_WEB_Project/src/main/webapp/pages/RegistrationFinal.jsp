<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>ONLINE RECRUTMENT APPLICATION</title>
</head>

<body>
	<div style="height: 55px;" id="header">
		<div class="shell">
			<div id="top">
				<h1>
					<a href="#">ONLINE RECRUTMENT APPLICATION</a>
				</h1>
			</div>
		</div>
	</div>
	<div id="container">
		<div class="shell">
			<div id="main">
				<div class="cl">&nbsp;</div>
				<div id="content">
					<div class="box" id="loginform">
						<div class="box-head">
							<h2 class="left">
								REGISTRATION <span style="font-size: 11px; color: #FFFFFF">
									(All Fields are Mandatory)</span>
							</h2>
						</div>
						<div>
							<form:form modelAttribute="registration">
								<div>
									<table class="front" style="background: transparent;">
										<tr>
											<td width="30%"><b>Name</b></td>
											<td>
												<form:input title="First Name" path="fstname" />
												<form:input title="Middle Name" path="middlename" />
												<form:input title="Last Name" path="lastname" />
												<br> <span class="note">[Note 1: Please do not use any prefix
													such as Shri/ Mr./ Ms./ Dr./ Mrs. Etc.]</span>
												<br> <span class="note"></span>
											</td>
										</tr>
										<tr>
											<td width="30%"><b>Father's Name</b> <br>
												<span class="note"></span></td>
											<td>
												<form:input title="First Name" path="fatherfstname" />
												<form:input title="Middle Name" path="fathermiddlename" />
												<form:input title="Last Name" path="fatherlastname" />
												<br> <span class="note">[Note 1 : Please do not use any prefix
													such as Shri/ Mr./ Dr. Etc.]<br />[Note 2 : Candidate who
													has single parent may fill either Mother's Name or Father's
													Name in both the fields.]
												</span></td>
										</tr>

										<tr>
											<td width="30%"><b>Mother's Name</b><br>
												<span class="note"></span></td>
											<td>
												<form:input title="First Name" path="motherfstname" />
												<form:input title="Middle Name" path="mothermiddlename" />
												<form:input title="Last Name" path="motherlastname" />
												<br> <span class="note">[Note 1 : Please do not use any prefix
													such as Shri/ Mr./ Dr. Etc.]<br />[Note 2 : Candidate who
													has single parent may fill either Mother's Name or Father's
													Name in both the fields.]
												</span></td>
										</tr>
										<tr>
											<td width="30%"><b>Gender</b></td>
											<td>
												<form:select name='sex' path='sex'>
													<form:option value='s'>--Select Gender--</form:option>
													<form:option value='Male'>Male</form:option>
													<form:option value='Female'>Female</form:option>
												</form:select>
											</td>
										</tr>

										<tr>
											<td valign="top"><strong>Community </strong></td>
											<td>
										<form:select path="community">
													<form:option value="0">--Select--</form:option>
													<form:option value="GEN">GEN</form:option>
													<form:option value="OBC">OBC</form:option>
													<form:option value="SC">SC</form:option>
													<form:option value="ST">ST</form:option>
										</form:select>
												
										<tr>
											<td><strong>Are You
													Physically Challenged ?</strong></td>
											<td colspan="100%">
												<form:select style="width: 120px" path="handicapp">
													<form:option value="s">---Select---</form:option>
													<form:option value="NO">NO</form:option>
													<form:option value="YES">YES</form:option>
												</form:select> <br>
											</td>
										
										<tr>
										<tr>
											<td width="30%"><b>Date Of Birth </b></td>
											<td style="text-align: justify">
												<form:input path="dob"/>
												<br>
												<span style="text-align: justify" class="note">[
												<strong style="text-align: justify">Note :</strong> 
													Date Of Birth as recorded
													in the Matriculation/10th Standard or equivalent
													certificate.]
													</span>
											</td>
										</tr>
										<tr>
											<td width="30%"><b>Place Of Birth </b></td>
											<td><form:input name="pob" value="" path="pob"/><br>
												 <span class="note">[Note: Enter Name of Village/City/Town]</span></td>
										</tr>
										<tr>
											<td width="30%"><b> Name of the State where You were born </b></td>
											<td><form:select name="sob" path="sob">
													<form:option value="0">--Select State--</form:option>
													<form:option value="ANN">Andaman & Nicobar Islands (UT)</form:option>

													<form:option value="AND">Andhra Pradesh</form:option>

													<form:option value="ARU">Arunachal Pradesh</form:option>

													<form:option value="ASS">Assam</form:option>

													<form:option value="BIH">Bihar</form:option>

													<form:option value="CHG">Chandigarh (UT)</form:option>

													<form:option value="CHA">Chattisgarh</form:option>

													<form:option value="DAD">Dadra and Nagar Haveli (UT)</form:option>

													<form:option value="DAM">Daman & Diu (UT)</form:option>

													<form:option value="DEL">Delhi</form:option>

													<form:option value="GOA">Goa</form:option>

													<form:option value="GUJ">Gujarat</form:option>

													<form:option value="HAR">Haryana</form:option>

													<form:option value="HIM">Himachal Pradesh</form:option>

													<form:option value="JAM">Jammu & Kashmir</form:option>

													<form:option value="JHA">Jharkhand</form:option>

													<form:option value="KAR">Karnataka</form:option>

													<form:option value="KER">Kerala</form:option>

													<form:option value="LAK">Lakshadweep (UT)</form:option>

													<form:option value="MAD">Madhya Pradesh</form:option>

													<form:option value="MAH">Maharashtra</form:option>

													<form:option value="MAN">Manipur</form:option>

													<form:option value="MEG">Meghalaya</form:option>

													<form:option value="MIZ">Mizoram</form:option>

													<form:option value="NAG">Nagaland</form:option>

													<form:option value="ORI">Orissa</form:option>

													<form:option value="PON">Puducherry (UT)</form:option>

													<form:option value="PUN">Punjab</form:option>

													<form:option value="RAJ">Rajasthan</form:option>

													<form:option value="SIK">Sikkim</form:option>

													<form:option value="TAM">Tamil Nadu</form:option>

													<form:option value="TLG">Telangana</form:option>

													<form:option value="TRI">Tripura</form:option>

													<form:option value="UTT">Uttarakhand</form:option>

													<form:option value="UP">Uttar Pradesh</form:option>

													<form:option value="WES">West Bengal</form:option>

													<form:option value="fc">Foreign Country</form:option>

												</form:select> <br> <span class=note>[Note: Please select
													foreign country if born outside india]</span></td>
										</tr>

										<tr id="fcon_tr" style="display: none;">
											<td width="30%">&nbsp;</td>
											<td>
												<div id="fcon"></div>
											</td>
										</tr>
										<tr id="countryother" style="display: none;">
											<td width="30%">&nbsp;</td>
											<td>
												<div>
													<form:input size="30" maxlength="30" type="text" path="countryother" />
												</div>
											</td>
										</tr>
										<tr>
											<td width="30%"><b>Nationality</b></td>
											<td>
												<form:select name="nationality" path="nationality" style="width: 550px;">
													<form:option value='s'>--Select Nationality--</form:option>
													<form:option title="Citizen of India" value='1' selected="selected">Citizen of India</form:option>
								
													<form:option title="Subject of Nepal" value='2'>Subject
														of Nepal</form:option>

													<form:option title="Subject of Bhutan" value='3'>Subject
														of Bhutan</form:option>
	
												</form:select>
												<br> <span class=note>[Note: All candidates,
													except Citizen of India, will be required to produce
													certificate of eligibility issued by the Government of
													India]</span></td>
										</tr>
										<!--Mobile control-->
										<tr>
											<td width="30%"><b>Mobile Number </b></td>
											<td>
												<form:input path="mobileno"/> <br>
												<span class="note">[Enter Your Mobile Number without
													91 or +91 As. 9999988888]</span> <br /> <span class="note">[Please
													Note that any communication from UPSC will be sent on this
													mobile number only.]</span></td>
										</tr>
										<tr>
											<td width="30%"><b>
													Confirm Mobile Number </b></td>
											<td><form:input  path="mobileno_confirm"/></td>
										</tr>
										<!--End Mobile Control-->
										<tr>
											<td width="30%"><b>E-mail Address</b></td>
											<td><form:input path="Email"/>
												<br> <span class="note">[Enter
													Your E-mail Address which is current and active as any
													communication from UPSC will be sent on this e-mail only.]</span>
											</td>
										</tr>
										<tr>
											<td width="30%"><b>Confirm
													E-mail Address </b></td>
											<td><form:input path="confirmEmail"/></td>
										</tr>

										<tr>
											<td width="30%"><b>Desired
													Password</b></td>
											<td>
												<div style="float: left;">
													<form:input  type="password" path="DesiredPassword"/>
												</div>
												<br><br>
												<div style="float: none" id="message">
													<div class="note" align="left">Password must fulfil
														following conditions:</div>
													<div id="letter" class="invalid">
														A <b>Lowercase</b> Letter(a-z)
													</div>
													<div id="capital" class="invalid">
														An <b>Uppercase</b> Letter(A-Z)
													</div>
													<div id="number" class="invalid">
														A <b>Number (0-9)</b>
													</div>
													<div id="length" class="invalid">
														<b>Length of Password should be 10 to 20 characters</b>
													</div>
												</div>
												<!--<div id="passwordDescription">Password not entered</div>-->

											</td>
										</tr>
										<tr>
											<td width="30%"><b>Confirm
													Password</b></td>
											<td><form:input name="ConfirmPassword" type="password" path='ConfirmPassword' value=''/>
												&nbsp;<span id="showmatchpassword"></span></td>
										</tr>
									</table>
								</div>

								<div align="center">
									<br/>
									<form:button>Reset</form:button>&nbsp;
									<form:button>Save & Continue</form:button>
									<br/> <br/>
								</div>
								<div>
									<br/>
								</div>
							</form:form>
						</div>
						<div style="color: #FFFFFF; font-size: 14px; background-color: #003;">

							<pre style="font-family: Verdana, sans-serif; font-size: 11px;">  Current Time &amp; Date :- ${time}	                                                                                (Your Machine IP  Address - :<font
									id="blink1"> http://locolhost:8080</font>)</pre>

						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>