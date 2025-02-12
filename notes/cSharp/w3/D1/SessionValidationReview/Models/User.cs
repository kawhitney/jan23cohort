#pragma warning disable CS8618
using System.ComponentModel.DataAnnotations;
namespace SessionValidationReview.Models;

public class User {
    [Required]
    [MinLength(2)]
    public string FirstName {get; set;}
    [Required]
    [MinLength(2)]
    public string LastName {get; set;}
    [Required]
    public DateTime Birthday {get; set;}
    [Required]
    [MinLength(5)]
    public string UserName {get; set;}
    [Required]
    [EmailAddress]
    public string Email {get; set;}
    [Required]
    [MinLength(8)]
    public string Password {get; set;}
}