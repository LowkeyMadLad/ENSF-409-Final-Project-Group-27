/**
* @author Ryan Mailhiot 30080009<a
* href="mailto:ryan.mailhiot@ucalgary.ca">ryan.mailhiot@ucalgary.ca</a>
* @version 1.1 
* @since 0.0
*/

package FPCode;

/**
 * ClientType enum is used in client to set the type of client. Contains ADULTMALE, ADULTFEMALE, CHILDOVER8, CHILDUNDER8. Each enum will have a
 * method called "typeAsString" which returns the type of the client as a pre determined string for printing.
 * @since 0.1
 */
public enum ClientType {
    ADULTMALE{
        public String typeAsString(){
            return "Adult Male";
        }
    },
    ADULTFEMALE{
        public String typeAsString(){
            return "Adult Female";
        }
    },
    CHILDOVER8{
        public String typeAsString(){
            return "Child Over 8 years old";
        }
    },
    CHILDUNDER8{
        public String typeAsString(){
            return "Child Under 8 years old";
        }
    };
    /**
     * Returns a string of the type of client.
     * @return String
     */
    public abstract String typeAsString();
}


