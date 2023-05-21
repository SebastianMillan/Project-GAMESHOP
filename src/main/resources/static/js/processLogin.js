let togglePassword = document.querySelector("#togglePassword");
let password = document.querySelector("#password");
togglePassword.addEventListener("click", () => {
  let type = password.getAttribute("type") === "password" ? "text" : "password";
  password.setAttribute("type", type);
  password.classList.toggle("bi-eye");
});
